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


insert into savings(accountNumber, username, accountPeriod, montlyDeposit, interest, interestRate, totalInput, total)
values((select nvl(max(accountNumber),0)+1 from savings), '±èÁÖÇö', 3, 30000, 30, DEFAULT, 3000, 30030);

insert into savings(accountNumber, username, accountPeriod, montlyDeposit, interest, interestRate, totalInput, total)
values((select nvl(max(accountNumber),0)+1 from savings), '±èÁÖÇö', 3, 30000, montlyDeposit*interestRate, DEFAULT, 3000, 30030);

