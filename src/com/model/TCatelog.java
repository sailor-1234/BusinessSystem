package com.model;

/**
 * TCatelog generated by MyEclipse Persistence Tools
 */

//���ݿ���Ʒ�����
public class TCatelog implements java.io.Serializable
{

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer catelogId;

	private String catelogName;

	private String catelogMiaoshu;
	
	private String catelogDel;

	// Constructors

	/** default constructor */
	public TCatelog()
	{
	}

	/** full constructor */
	public TCatelog(String catelogName, String catelogMiaoshu)
	{
		this.catelogName = catelogName;
		this.catelogMiaoshu = catelogMiaoshu;
	}

	// Property accessors

	public Integer getCatelogId()
	{
		return this.catelogId;
	}
	

	public String getCatelogDel()
	{
		return catelogDel;
	}

	public void setCatelogDel(String catelogDel)
	{
		this.catelogDel = catelogDel;
	}

	public void setCatelogId(Integer catelogId)
	{
		this.catelogId = catelogId;
	}

	public String getCatelogName()
	{
		return this.catelogName;
	}

	public void setCatelogName(String catelogName)
	{
		this.catelogName = catelogName;
	}

	public String getCatelogMiaoshu()
	{
		return this.catelogMiaoshu;
	}

	public void setCatelogMiaoshu(String catelogMiaoshu)
	{
		this.catelogMiaoshu = catelogMiaoshu;
	}

}