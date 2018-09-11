create table plastic_board (
	no number(4) primary key,
	writer varchar2(80) not null,
	content varchar2(500) not null,
	reg_date date default sysdate
);

alter table plastic_board
add (title varchar2(500));


create sequence seq_plastic_board_no;

create table plastic_board_file (
	fno number(4) primary key,
	no number(4),
	ori_file_name varchar(200) not null,
	real_file_name varchar(200) not null,
	file_size varchar(200) not null,
	file_path varchar(200) not null,
	constraint "fk_file_board" foreign key (no) references plastic_board(no) on delete cascade
);

create sequence seq_plastic_board_file_no;


create table plastic_board_comment (
	cno number(4) primary key,
	no number(4),
	writer varchar2(100),
	content varchar2(500),
	reg_date date default sysdate,
	constraint "fk_comment_board" foreign key (no) references plastic_board(no) on delete cascade
);

create sequence seq_plastic_board_comment_no;



insert into plastic_board (no, title, writer, content, reg_date) values (seq_plastic_board_no.nextVal, '페이징테스트','박상현', '내용은 대충써', sysdate);
