class f11
{
	public static void main(String[] args) {
    System.out.print("String method:\n");
    String name="Jeel Gandhi hi";
    System.out.println(name);

    System.out.println(name.length());//it gives length of string...
    System.out.println(name.toLowerCase());//it convert the given string to lower case.....
    System.out.println(name.toUpperCase());//it convert the given string to upper case.......
    System.out.println(name.trim());//it trim the string it means that remove extra part of string...
    System.out.println(name.substring(2));//it gives the after string to 2....
    System.out.println(name.substring(5,10));//it gives the between value...
    System.out.println(name.replace('i','w'));//it replace the Character..
    System.out.println(name.replace("Gandhi","modi"));//it replace the string...
    System.out.println(name.startsWith("je"));//it check the string start from "je" if yes then return true otherwise false
    System.out.println(name.endsWith("hi"));//it check the string end from"hi" if yes then return true otherwise false
    System.out.println(name.charAt(5));//it gives the value at position
    System.out.println(name.indexOf("hi"));//it check the position of given string...
    System.out.println(name.lastIndexOf("hi"));//it gives the last time when this exist...
    System.out.println(name.equals("jeel gandhi"));//if same give true then false
    System.out.println(name.equalsIgnoreCase("jeel gandhi"));//it ignore case..
	}
}
