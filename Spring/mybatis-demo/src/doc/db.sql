/*
 * 班主任
 */
CREATE TABLE tb_head_teacher(
fid int PRIMARY KEY auto_increment,
fname VARCHAR(20),
fage int
);

/*
 * 班别
 */
CREATE TABLE tb_class(
fid INT PRIMARY KEY auto_increment,
fname VARCHAR(20),
fht_id int UNIQUE,
FOREIGN KEY(fht_id) REFERENCES tb_head_teacher(fid)
);

/*
 * 学生
 */
CREATE TABLE tb_student(
fid int PRIMARY KEY auto_increment,
fname VARCHAR(20),
fsex VARCHAR(10),
fage int,
fclass_id int,
FOREIGN KEY(fclass_id) REFERENCES tb_class(fid)
);

/*
 * 课程
 */
CREATE TABLE tb_course(
fid INT PRIMARY KEY auto_increment,
fname VARCHAR(20),
fcredit INT
);

/*
 * 所选课程
 */ 
CREATE TABLE tb_select_course(
fstu_id int,
fcourse_id int,
fdate date,
PRIMARY KEY(fstu_id,fcourse_id),
FOREIGN KEY (fstu_id) REFERENCES tb_student(fid),
FOREIGN KEY (fcourse_id) REFERENCES tb_course(fid)
);

/**
 * 用户表
 */
create table tb_user(
fid INT PRIMARY KEY auto_increment,
fusername VARCHAR(20),
fpassword VARCHAR(20),
fsex VARCHAR(10),
fage int,
fphone VARCHAR(20),
faddress VARCHAR(20) 
);
