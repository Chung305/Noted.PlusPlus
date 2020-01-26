package modelTest;

import com.Noted.NoteddPlusPlus.models.Note;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class NoteTest {


    @Test
    public void constructorTest(){
        //given
        String category = "thoughts";
        String description = "Chung is the greatest";
        Date date = new Date();

        //when
        Note newNote = new Note();
        newNote.setCategory(category);
        newNote.setDesciption(description);
        newNote.setDate(date);

        //when
        Assert.assertEquals(category, newNote.getCategory());
        Assert.assertEquals(description, newNote.getDesciption());
        Assert.assertEquals(date, newNote.getDate());






    }
}
