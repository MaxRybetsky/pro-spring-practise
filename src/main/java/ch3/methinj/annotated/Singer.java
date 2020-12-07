package ch3.methinj.annotated;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("singer")
@Scope("prototype")
public class Singer {
    private String lyric = "I played a quick game of chess with the salt and pepper shaker";
    public void sing() {
        //commented because it pollutes the output
        //System.out.println(lyric);
    }
}
