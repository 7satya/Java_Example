import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void TestgetName() {
        Student newStud = new Student();
        newStud.SetName("Vivek");
        Assert.assertEquals(newStud.getName(), "Vivek");
    }

    @Test
    public void TestgetRollNumber() {
        Student o1 = new Student();
        o1.setRoll_no(939);

        Assert.assertNotNull(o1.getRoll_no());
    }
}
