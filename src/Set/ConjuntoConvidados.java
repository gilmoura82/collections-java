package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionaConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;

		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			} else {
				System.out.println("Não existe convidado com esse convite");
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}

	public int contarConvidados() {
		return convidadoSet.size();
	}

	public void exibirConvidados() {
		System.out.println("Convidados cadastrados: " + convidadoSet);
	}
	
	

}
