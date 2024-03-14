class Main
{
	public static void main(String[] args) {
    System.out.print("String method:\n");
    String name="Jeel Gandhi";
    System.out.println(name);

    System.out.println(name.length());
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.trim());
    System.out.println(name.substring(3));
    System.out.println(name.substring(5,10));
    System.out.println(name.replace('i','w'));
    System.out.println(name.replace("Gandhi","modi"));
    System.out.println(name.startsWith("je"));
    System.out.println(name.endsWith("hi"));
    System.out.println(name.charAt(5));
    System.out.println(name.indexOf("an"));
    
	}
}
