package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class TestConvert {
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	public void test_num2text_un () {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	public void test_num2text_deux () {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	public void test_num2text_trois () {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	public void test_num2text_quatre () {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	public void test_num2text_cinq () {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	public void test_num2text_six () {
		Assert.assertEquals("six", Convert.num2text("6"));
	}
	public void test_num2text_sept () {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}
	public void test_num2text_huit () {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}
	public void test_num2text_neuf () {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
	public void test_num2text_dix () {
		Assert.assertEquals("dix", Convert.num2text("10"));
	}
	public void test_num2text_onze () {
		Assert.assertEquals("onze", Convert.num2text("11"));
	}
	public void test_num2text_douze () {
		Assert.assertEquals("douze", Convert.num2text("12"));
	}
	public void test_num2text_treize () {
		Assert.assertEquals("treize", Convert.num2text("13"));
	}
	public void test_num2text_quatorze () {
		Assert.assertEquals("quatorze", Convert.num2text("14"));
	}
	public void test_num2text_quinze () {
		Assert.assertEquals("quinze", Convert.num2text("15"));
	}
	public void test_num2text_seize () {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}
	
	
}
