import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory(){
        this.changes = new ArrayList<>();
    }

    public void add(double status){
        changes.add(status);
    }

    public void clear(){
        changes.clear();
    }

    public String toString(){
        return changes + "";
    }

    public double maxValue(){
        if (!changes.isEmpty()) {
            return Collections.max(changes);
        }
        return 0;
    }

    public double minValue(){
        if(!(changes.isEmpty())) {
            return Collections.min(changes);
        }
        return 0;
    }

    public double average(){
        if(!changes.isEmpty()){
            double total = 0;
            for(int i = 0; i<= changes.size(); i++){
                total += changes.get(i);
            }
            return (double) total/changes.size();
        }
        return 0;
    }

}
