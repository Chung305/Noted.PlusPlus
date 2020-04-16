package modelTest;

import com.Noted.NoteddPlusPlus.models.Note;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class NoteTest {


    @Test
    public void constructor_Test(){
        //given
        String description = "Chung is the greatest";
        Date date = new Date();

        //when
        Note newNote = new Note();
        newNote.setDescription(description);
        newNote.setDate(date);

        //when
        Assert.assertEquals(description, newNote.getDescription());
        Assert.assertEquals(date, newNote.getDate());
    }

    @Test
    public void setter_getter_Test(){
        //given
        String description = "chung is back for development";
        Date date = new Date();

        //when
        Note newNote = new Note();
        newNote.setDescription(description);
        newNote.setDate(date);

        //then
        Assert.assertEquals(description, newNote.getDescription());
        Assert.assertEquals(date, newNote.getDate());
    }


}
