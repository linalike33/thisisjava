//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
 System.out.println("Hello and welcome!");

 MyClass stu = new MyClass("이순신", "mjc9283819", major.Computer);
 Translson tj = new Translson();

 String strJson = tj.toJsonStringFromObject(stu);
 System.out.println(strJson);

 Object res = tj.toObjectFromJsonString(strJson, MyClass.class);
 if ( res instanceof MyClass stu2 ) {
  System.out.println(stu2);
 }
 System.out.println(tj.hashCode());
 System.out.println(res.hashCode());
}
