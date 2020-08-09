import java.util.*;

public class TraineeMain {


    Map<Integer, Trainee> trainees = new HashMap<>();
    Set<CsTrainee> csTrainees = new HashSet<>();
    Set<EcTrainee> ecTrainees = new HashSet<>();

    public static void main(String[] args) {
        TraineeMain demo = new TraineeMain();
        demo.runApp();

    }

    public void runApp() {

        Trainee trainee1 = new Trainee(1, "ankit");
        Trainee trainee2 = new Trainee(2, "ankur");
        Trainee trainee3 = new Trainee(3, "anoop");
        Trainee trainee4 = new Trainee(4, "ank");

        trainees.put(1, trainee1);
        trainees.put(2, trainee2);
        trainees.put(3, trainee3);
        trainees.put(4, trainee4);
        display();
    }

    public void display() {




		for (Trainee trainee : trainees.values()) {
			boolean isCsTrainee = trainee instanceof CsTrainee;
			if (isCsTrainee) {
				csTrainees.add((CsTrainee) trainee);
			} else {
				ecTrainees.add((EcTrainee) trainee);
			}

		}
		for (CsTrainee cse :csTrainees) {
			int id = cse.getId();
			int language = cse.getLanguages();
			String name = cse.getName();

			System.out.print("name of trainee:-\n"+name+" \n   Id:-  "+id+"\n Languages known :-"+language);

		}
		for (EcTrainee ece :ecTrainees) {
			int id = ece.getId();
			String device = ece.getDevice();
			String name = ece.getName();

			System.out.print("names of trainee:-\n"+name+"\n id:-"+id+"\n devices alloted:-"+device);

		}




/*
        for (Trainee trainee : trainees.values()) {
            boolean isCsTrainee = trainee instanceof CsTrainee;
            if (isCsTrainee) {
                CsTrainee cs = (CsTrainee) trainee;
                csTrainees.add(cs);
            } else {
                EcTrainee ec = (EcTrainee) trainee;
                ecTrainees.add(ec);
            }

        }
		for (CsTrainee cse :csTrainees) {
			int id = cse.getId();
			int language = cse.getLanguages();
			String name = cse.getName();

			System.out.print("name of trainee:-\n"+name+" \n   Id:-  "+id+"\n Languages known :-"+language);

		}
		for (EcTrainee ece :ecTrainees) {
			int id = ece.getId();
			String device = ece.getdeviceused();
			String name = ece.getName();

			System.out.print("names of trainee:-\n"+name+"\n id:-"+id+"\n devices alloted:-"+device);

		}










*/





/*
		for (Trainee trainee : trainees.values()) {
			boolean isCsTrainee = trainee instanceof CsTrainee;
			if (isCsTrainee) {
				CsTrainee cs = (CsTrainee) trainee;
				csTrainees.add(cs);
				System.out.println(cs.getLanguages() + cs.getId() + cs.getName());
			} else {
				EcTrainee ec = (EcTrainee) trainee;
				ecTrainees.add(ec);
				System.out.println(ec.getdeviceused() + ec.getName() + ec.getId());
			}
		}
*/

    }
}