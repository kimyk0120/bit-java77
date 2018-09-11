

function mlec(val) {
	// val의 값이 입력되지 않았을 때
	if (!val)
		return;

	// val : #title
	// val : .title
	// val : title

	var elements;

	var ch = val.charAt(0);

	switch (ch) {
	case "#":
		elements = document.querySelector(val);
		break;
	case "<":
		elements = document.createElement(val.substring(1,val.length -1)); break;
	default:
		elements = document.querySelectorAll(val);

	}

	/*
	 * 매개변수 html 에 값이 존재한다면 elements에 설정한다. 값이 존재하지 않는다면 elements의 innerHTML에 값을
	 * 넘겨준다.
	 * 
	 * elements 가 여러개의 요소를 가지고 있다면 elements[0]에 적용
	 */

	elements.html = function(html) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
			// elements 의 0번째 요소에 처리
			// 값이 입력된 경우
			if (html) {
				this[0].innerHTML = html;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this[0].innerHTML;
		}
		// elements의 요소가 하나인 경우
		else {

			if (html) {
				this.innerHTML = html;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this.innerHTML;
		}
	};
	
	elements.text = function(text) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
			// elements 의 0번째 요소에 처리
			// 값이 입력된 경우
			if (text) {
				this[0].textContent = text;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this[0].textContent;
		}
		// elements의 요소가 하나인 경우
		else {
			
			if (text) {
				this.textContent = text;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this.textContent;
		}
	};
	
	elements.css = function(name,val) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
			// elements 의 0번째 요소에 처리
			// 값이 입력된 경우
			if (val) {
				this[0].style[name] = val;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this[0].style[name];
		}
		// elements의 요소가 하나인 경우
		else {
			
			if (val) {
				this.style[name] = val;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this.style[name];
		}
	};

	elements.attr = function(name,val) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
			// elements 의 0번째 요소에 처리
			// 값이 입력된 경우
			if (val) {
				this[0].v(name,val);
				return this;
			}
			// 값이 입력되지 않은 경우
			return this[0].getAttribute(name);
		}
		// elements의 요소가 하나인 경우
		else {
			
			if (val) {
				this.setAttribute(name,val);
				return this;
			}
			// 값이 입력되지 않은 경우
			return this.getAttribute(name);
		}
	};
	
	elements.val = function(msg) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
			// elements 의 0번째 요소에 처리
			// 값이 입력된 경우
			if (msg) {
				this[0].value = msg;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this[0].value;
		}
		// elements의 요소가 하나인 경우
		else {
			
			if (msg) {
				this.value = msg;
				return this;
			}
			// 값이 입력되지 않은 경우
			return this.value;
		}
	};
	
	elements.append = function(elements) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
				this[0].appendChild(elements);
				return this;
		}
		else {
				this.appendChild(elements);
				return this;
		}
	};
	elements.on = function(type, listener) {
		// elements의 요소가 여러개인지 판단
		// elements 의 요소가 하나라면 length는 undefined가 된다.
		if (elements.length) {
			this[0].addEventListener(type, listener);
			return this;
		}
		else {
			this.addEventListener(type, listener);
			return this;
		}
	};

	return elements;

}

var $ = mlec;
