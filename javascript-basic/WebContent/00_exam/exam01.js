/**
 * var data = new MyMap(); data.put("id", "sbc"); data.put("name", "son");
 * 
 * console.log(data.size()) //2 console.log(data.get("id")) //sbc
 * 
 * data.del("id"); console.log(data.get("id")) // undefined data.clear();
 * console.log(data.size()) // 0
 * 
 * 프로토타입으로 만들면 모든 객체 공유 가능
 */

function MyMap(){
	this.data = {};
	this.count = 0;
};

MyMap(id, name) {

	MyMap.prototype = {
		put : function(key, value) {
			this.data[key] = value;
			this.count++;
		},

		size : function() {
			return this.count;
		},

		get : function(key) {
			return this.data[key];
		},

		del : function(key) {
			delete this.data[key];
			this.count--;
		},
		
		clear : function(){
			this.data={};
			this.count=0;
		}
	}

};