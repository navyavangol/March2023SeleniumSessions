package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectorConcept {

	public static void main(String[] args) throws InterruptedException {

//if we have multiple classes are there, not necessarily to write in the same order as in the class attribute - sequence is not a matterF

		// css selector work only for the attributes

		// in css only we can go forward so webtables cannot be handle by using css
		// webtables can be handle using xpath becoz we can go forward and back
		// direction
		// question: give me all the id's in the page
		// [id] -css selector - here two forward slashes for commenting not used for css
		// selector
		// *[@id] - xpath

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");
		Thread.sleep(4000);

		// id --> #id
		// tag#id
		// #input-email
		// input#input-email

		// class --> .class
		// tag.class
		// input.form-control
		By.cssSelector("input.form-control");

		// c1 c2 c3 ....cn
		// .c1.c2.c3...cn
		// .form-control.private-form__control.login-email
		// tag.c1.c2.c3...cn
		// input.form-control.private-form__control.login-email
		// input.form-control.login-email
		// input.login-email.form-control.private-form__control
		// input.login-email

		// id and class:
		// #id.class
		// .class#id
		// tag#id.class
		// tag.class#id
		// #username.login-email
		// .login-email#username
		// .form-control.private-form__control.login-email#username
		// #username.form-control.private-form__control.login-email
		// input#username.form-control.private-form__control.login-email
		// input.login-email#username.form-control.private-form__control

		// other attr:
		// tagname[attr='value']
		// input[placeholder='E-Mail Address'] - css
		// input[@placeholder='E-Mail Address'] -- xpath

		// more than 1 attr:
		// tagname[attr1='value'][attr2='value'][attr3='value']
		// input[type='text'][name='email'][placeholder='E-Mail Address']

		// input[type][name][placeholder]
		// [id] -- css
		// *[@id] -- xpath

		// text in css: NA

		// CSS3

		// contains in css:
		// tag[attr*='value']
		// input[placeholder*='Address'] -- css
		// input[contains(@class,'Address')] -- xpath

		// input[placeholder*='Address'][id='input-email']

		// startswith in css:
		// tag[attr^='value']
		// input[placeholder^='E-Mail'] -- css
		// input[starts-with(@placeholder,'E-Mail')] - xpath

		// endswith in css:
		// tag[attr$='value']
		// input[placeholder$='Address'] -- css
		// input[ends-with(@placeholder,'Address')] -- xpath -- NA

		// input[placeholder*='Address'][id^='input'][class$='control']
		// input[placeholder*='Address'][class$='control']#input-email

		// parent to child:
		// select#Form_getForm_Country > option -- direct child elements
		// select#Form_getForm_Country option -- direct+indirect

		// form > div -- 2 child divs(directly)
		// form div --7 (direct+indirect child)
		// table#resultTable > tbody > tr > td

		// child to parent: backward traversing -- NA
		// child to ancestor : NA
		// preceding-sibling: NA

		// following-sibling: yes
		// label[for='input-email'] + input -- immediate following sibling
		// label[for='input-email'] ~ input -- all following sibling

		// indexing in css:
		// select#Form_getForm_Country option:first-child
		// select#Form_getForm_Country option:last-child
		// select#Form_getForm_Country option:nth-child(5)
		// select#Form_getForm_Country option:nth-last-child(2)
		// select#Form_getForm_Country option:nth-child(odd)
		// select#Form_getForm_Country option:nth-child(even)
		// select#Form_getForm_Country option:nth-child(n+4)
		// select#Form_getForm_Country option:nth-child(4n)

		// not in css:
		// form-control input-lg
		// form-control
		// input.form-control:not(.input-lg)
		// input.form-control:not(.input-lg):not(#input-password)

		// comma in css:
		// input#username, button#loginBtn, input#remember, div.signup-link -- 4 imp
		// elements
		By impEles = By.cssSelector("input#username, button#loginBtn, input#remember, div.signup-link");

		if (driver.findElements(impEles).size() == 4) {
			System.out.println("imp eles present on the page...PASS");
		} else {
			System.out.println("imp eles not present on the page...FAIL");

		}
	}

}
