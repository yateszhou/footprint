package org.footprint.demo;

public class MainTest {
	private static StringBuilder sb= new StringBuilder();
	
	public static void main(String[] args) {
		long start= System.currentTimeMillis();
//		StringBuilder sb= null;
//		for(int i=0;i<10000000;i++) {
////			sb= new StringBuilder();
//			sb.setLength(0);
//			sb.append("官方文档的这一段话已经明确描述了三者的关系。slf4j译为简单日志门面，是日志框架的抽象。而log4j和logback是众多日志框架中的几种。")
//			.append("safdad").append(123434);
//		}
		
		sb.append("官方文档的这一段话已经明确描述了三者的关系。slf4j译为简单日志门面，是日志框架的抽象。而log4j和logback是众多日志框架中的几种。")
		.append("safdad").append(123434);
		
		System.out.println(sb);
		
		sb.setLength(10);
		System.out.println(sb);
		System.out.println(System.currentTimeMillis()- start);
	}
	
	private  ThreadLocal<String> tl= new ThreadLocal<String>();
	
	private String str= "abc";
	
	public String getStr(){
		return str;
	}
	
//	public static void main(String[] args) {
//		MainTest mt= new MainTest();
//		mt.tl.set("abc");
//		long start= System.currentTimeMillis();
//		for(int i=0;i<1000000000;i++) {
////			String aa= mt.tl.get();
//			String aa= mt.getStr();
//		}
//		System.out.println(System.currentTimeMillis()- start);
//	}
}
