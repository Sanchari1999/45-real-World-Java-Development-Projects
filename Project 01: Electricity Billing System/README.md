<h3>Problem Statement:</h3>
<ul>
  <li>The manual system is suffering from a series of drawbacks.</li>
  <li>Since whole of the bills is to be maintained with hands, the process of keeping and maintaining the information is very tedious and lengthy to the customer.</li>
  <li>It is a very time consuming and laborious process because the staff needs to visit the customer's address every month to hand over the bills and to recieve the payments.</li>
</ul>

<hr>

<h3>Solution:</h3>
<ul>
  <li>This project system excludes the need of maintaining paper electricity bill as all the electricity bill records are managed electronically.</li>
  <li>Administrator does not have to keep a manual track of the users.</li>
  <li>The system automatically calculates fine.</li>
  <li>Users do not have to visit the office for paying bills.</li>
  <li>Hemunan efforts and costs are minimized aas there is no need to employ delivery executives to deliver the bills.</li>
</ul>

<hr>

<h3>Project Overview:</h3>
<ul>
  <li>This project aims at serving the department of electricity by computerizing the billing system.</li>
  <li>It mainly focuses on the calculation of units consumed during the specified time and the money to be charged by the electricity offices.</li>
  <li>This computerized system will make the overall billing system easy, accessible, comfortable, and effective for consumers.</li>
</ul>

<hr>

<h3>Hardware/ Software Requirements:</h3>
<ul>
  <li>Processor: Intel Pentinum V or higher</li>
  <li>Clock speed: 1.7 GHz or more</li>
  <li>System Bus: 64 bits</li>
  <li>Monitor: LCD Screen</li>
  <li>Keyboard: Standard keyboard</li>
  <li>Mouse: compatible mouse or Touchpad</li>
  <li>Operating System: Windows 10 or higher</li>
  <li>Software: Microsoft SQL Server</li>
  <li>Front-end: Java Core/ Swing</li>
  <li>Back-end: MySQL</li>
</ul>

<hr>

<h3>Components:</h3>
<ol>
  <li>MySQL Database:</li>
  <ul>
    <li>"ebs"</li>
  </ul>
  <li>Java Files::</li>
  <ul>
    <li>About</li>
    <li>BillDetails</li>
    <li>CalculateBill</li>
    <li>Conn</li>
    <li>CustomerDetails</li>
    <li>DepositDetails</li>
    <li>GenerateBills</li>
    <li>LastBill</li>
    <li>Login</li>
    <li>MeterInfo</li>
    <li>NewCustomer</li>
    <li>PayBill</li>
    <li>Paytm</li>
    <li>Project</li>
    <li>Signup</li>
    <li>UpdateInformation</li>
    <li>ViewInformation</li>
  </ul>
  <li>Image icons used in java files.</li>
  <li>Libraries:</li>
  <ul>
    <li>MySQL Java Connector</li>
    <li>JDK17</li>
    <li>rs2xml</li>
  </ul>
</ol>

<hr>

<h3>For Electricity Billing System Project DATABASE:</h3>
<ol>
  <li>Create database:</li>
  <ul>
    <li>create database ebs;</li>
  </ul>
  <li>Use the database you have just created:</li>
  <ul>
    <li>use ebs;</li>
  </ul>
  <li>Create login table:</li>
  <ul>
    <li>create table login(meter_no varachar(30), username varchar(30), name varchar(30), password varchar(30), user varchar(30));</li>
  </ul>
  <li>Create Customer table to store information of customer:</li>
  <ul>
    <li>create table customer(name varchar(30), meter varchar(30), address varchar(30), city varchar(30), email varchar(30), phone varchar(30));</li>
  </ul>
  <li>Create meter_info table to store the meter information of the customer:</li>
  <ul>
    <li>create table meter_info(meter_number varchar(30), meter_location varchar(30), meter_type varchar(30), phase_code varchar(30), bill_type varchar(30), days varchar(30));</li>
  </ul>
  <li>Create tax to store the current tax structure:</li>
  <ul>
    <li>create table tax(cost_per_unit varchar(30), meter_rent varchar(30), service_charge varchar(30), service_tax varchar(30), swacch_bharat_cess varchar(30), fixed_tax varchar(30));</li>
  </ul>
  <li>Insert some values in your tax table:</li>
  <ul>
    <li>insert into tax values('9', '47', '22', '57', '6', '18');</li>
  </ul>
  <li>Create bill table to store the billing information of the customer:</li>
  <ul>
    <li>create table bill(meter varchar(30), month varchar(30), total_bill varchar(30), status varchar(30));</li>
  </ul>
</ol>
