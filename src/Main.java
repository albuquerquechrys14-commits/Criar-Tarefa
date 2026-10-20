import Controller.PessoaController;
import Model.service.PessoaService;
void main() {
    PessoaService pessoaService = new PessoaService();
    PessoaController pessoaController = new PessoaController(pessoaService);

    pessoaController.criarPessoa();
}
