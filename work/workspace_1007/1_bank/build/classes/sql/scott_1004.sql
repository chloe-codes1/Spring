drop table loan CASCADE CONSTRAINTS;

create table loan(
    accountNumber Varchar2(30) primary key,
    username varchar2(20) NOT NULL,
    accountPeriod NUMBER(8) NOT NULL,
    loan NUMBER(8),
    interest NUMBER(8),
    interestRate NUMBER(3,1) DEFAULT 12.5,
    monthlyRA NUMBER(8)
);

insert into loan(accountNumber, username, accountPeriod, loan, interest, interestRate, monthlyRA)
          values((select nvl('1-' + max(accountNumber) ,0)+1 from loan), '김주현', 12, 100000, 2000,DEFAULT, 3000);