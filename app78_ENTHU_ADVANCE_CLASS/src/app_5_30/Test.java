package app_5_30;

interface Book{
	
	static  String aaa() {
		return " static aaa";
	};
	
	
	default String bbb() {
		return "default bbb";
	}
}

interface Encyclopedia extends Book{
	
	default String aaa() {    // it is alloweed to override from static to default
		return "default aaa";
	}
	
	
//	static String bbb() {       not alloweed to everride from defualt to static
//		return "static bbb";
//	}
	
	
	default String bbb() {     // default to redeclare default method we can override
		return "---------";
	}
}






public class Test {
                 

}