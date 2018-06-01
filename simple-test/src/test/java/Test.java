
public class Test {
    public static void main(String[] args) {
        String s=null;
        assert s!=null?true:false;
        System.out.println(2);

        System.out.println(fun());

    }

    public static int fun(){
        int x;
        try{
            x=1;
            assert 1/0==2;
            return x;
        }catch (Exception e){
            x=2;
            return x;
        }finally {
            x=3;
        }
    }
}
