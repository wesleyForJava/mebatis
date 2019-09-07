import com.wesley.mebatis.*;

public class MeBatisTest {

    public static void main(String[] args) {
        WSqlSession sqlSession=new WSqlSession(new WConfiguration(),new WExcutor());
        BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Blog blog = blogMapper.selectBlogById(1);
    }
}
