package com.sist.inter;

import java.util.*;

interface Connection{
	public void connection();
}

class ����Ŭ implements Connection{
	public void connection()
	{
		System.out.println("����Ŭ ����");
	}
}

class DB2 implements Connection{
	public void connection()
	{
		System.out.println("DB2 ����");
	}
}

class MSSQL implements Connection{
	public void connection()
	{
		System.out.println("MSSQL ����");
	}
}

class MySQL implements Connection{
	public void connection()
	{
		System.out.println("MySQL ����");
	}
}

public class Container {
	Map map=new HashMap();
	public Container() {
		map.put("orcle",new ����Ŭ());
		map.put("db2",new DB2());
		map.put("mssql",new MSSQL());
		map.put("mysql",new MySQL());		
	}
	public Connection getBean(String key)
	{
		return (Connection)map.get(key);
	}
	
}
