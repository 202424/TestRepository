package myMP3;

import org.junit.Assert;

import org.junit.Test;

public class TestPlayer {

	@Test
	public void test(){
		Datei datei = new Datei()
		.WithTitel("Mallo")
		.WithZahl(17);

		Datei datei2 = new Datei("Francko", 19);

		Datei nodatei = null;

		Student st = new Student();

		datei.viewStudent(st);

		Assert.assertEquals("juste un test", 17, st.getCredits());
		Assert.assertNotNull("no datei", datei2);
	}
}