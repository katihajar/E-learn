package plateform;

import java.util.ArrayList;
import java.util.List;

public class MediateurImpl1 extends Mediateur{
	List<Message> conv = new ArrayList<>();
	List<User> coll = new ArrayList<>();

	@Override
	public void TransmettreMsg(Message m) {
		System.out.println("------------");
		System.out.println("MediateurImpl1");
		System.out.println("message de :"+ m.getExpediteur());
		System.out.println("vers :"+ m.getDestinataire());		
		System.out.println("Contenu du message :"+ m.getContenu());
		User dest = map.get(m.getDestinataire());
			if(!coll.contains(dest)) {
				System.out.println("------------");
				System.out.println(" coll exist");
				System.out.println("------------");
				
			}else {
				System.out.println("nouveau coll");
				coll.add(dest);
			}
			dest.recevoir(m);
		conv.add(m);
	}

}
