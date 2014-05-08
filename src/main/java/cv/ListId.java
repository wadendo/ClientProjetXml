package cv;

import javax.xml.bind.annotation.XmlElement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by matekordial on 02/05/2014.
 */
public class ListId {
    List<Integer> resumeListId= new LinkedList<Integer>();
    @XmlElement
    public  List<Integer>  getList(){
        return resumeListId;
    }
}

