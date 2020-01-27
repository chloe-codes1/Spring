drop table savings cascade constraints;
drop table loan cascade constraints;

create table savings(
    accountNumber varchar2(30) primary key,
    username varchar2(20) NOT NULL,
    accountPeriod NUMBER(8) NOT NULL,
    montlyDeposit NUMBER(10) NOT NULL,
    interest NUMBER(8),
    interestRate NUMBER(3,1) DEFAULT 5.7,
    totalInput NUMBER(10),
    total NUMBER(10)
);

create table loan(
    accountNumber Varchar2(30) primary key,
    username varchar2(20) NOT NULL,
    accountPeriod NUMBER(8) NOT NULL,
    loan NUMBER(8),
    interst NUMBER(8),
    interestRate NUMBER(3,1) DEFAULT 12.5
);

 drop sequence saving_seq;
         
 create sequence saving_seq
 MINVALUE 0
 START WITH 0
 INCREMENT BY 1
 MAXVALUE 10000;


insert into savings(accountNumber, username, accountPeriod, montlyDeposit, interest, interestRate, totalInput, total)
values('1-100'|| saving_seq.nextval, '김주현', 3, 30000, 30, DEFAULT, 3000, 30030);


