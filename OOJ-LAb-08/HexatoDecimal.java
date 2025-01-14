import java.util.Scanner;
class HexatoDecimal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Hexadecimal: ");
String str=sc.next();
int d=0, t=1;
for(int i=str.length()-1;i>=0;i--)
{
System.out.println(str.charAt(i));
if('A'==str.charAt(i)||'a'==str.charAt(i)) {
d=d+(10*t); }
else if('B'==str.charAt(i)||'b'==str.charAt(i)) {
d=d+(11*t); }
else if('C'==str.charAt(i)||'c'==str.charAt(i)) {
d=d+(12*t); }
else if('D'==str.charAt(i)||'d'==str.charAt(i)) {
d=d+(13*t); }
else if('E'==str.charAt(i)||'e'==str.charAt(i)) {
d=d+(14*t); }
else if('F'==str.charAt(i)||'f'==str.charAt(i)) {
d=d+(15*t);}
else {
d=(((int)str.charAt(i)-(int)'0')*t)+d;}
t=t*16;
}
System.out.println(d);
}
}
