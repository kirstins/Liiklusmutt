import java.util.ArrayList;

/**
 * Created by kirstin on 03/02/2017.
 */
public class Andmed {
    ArrayList<String> suunad=new ArrayList<>();

    public void lisaAndmed(String a){
        suunad.add(a);

        for (int i=0; i<suunad.size(); i++){
            System.out.println("Suund: "+suunad.get(i));
        }
    }

    public String autodKokku(){
        int kokku=suunad.size();
        String autod=new String("Läbisõitnud autode arv on: "+kokku);
        return autod;
    }
    public String igasSuunas(){
        int kesklinn=0;
        int mustamae=0;
        int tabasalu=0;
        int paldiski=0;
        String tempVariable="";

        for (int i=0; i<suunad.size(); i++){
            tempVariable=suunad.get(i);
            if(tempVariable.equals("Kesklinn")){
                kesklinn++;
            }
            else if (tempVariable.equals("Mustamäe")){
                mustamae++;
            }
            else if (tempVariable.equals("Tabasalu")){
                tabasalu++;
            }
            else if(tempVariable.equals("Paldiski")){
                paldiski++;
            }
        }
        String loendur =new String("Kesklinn: "+kesklinn+" ,Mustamäe: "+mustamae+", Tabasalu: "+tabasalu+", Paldiski: "+paldiski);
        return loendur;
    }
     public String populaarseimSuund (){
        String populaarseim="";
        int count=0;

        for (int i=0; i<suunad.size(); i++){
            String tempElement=suunad.get(i);
            int tempCount=0;
            for( int j=0; j<suunad.size(); j++){
                if (suunad.get(j).equals(tempElement)){
                    tempCount++;
                }
                if (tempCount>count){
                    count=tempCount;
                    populaarseim=tempElement;
                }
            }

        }
        String pop=new String("Populaarseim suund on: "+populaarseim+". Selles suunas liikunud autode arv on: "+count);
        return pop;
    }
}
