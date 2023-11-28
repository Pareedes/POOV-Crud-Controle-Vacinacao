package trabalhofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerTelaPrincipal {

    @FXML
    private Button botaoCriarAplicação;

    @FXML
    private Button botaoPesquisarPessoa;

    @FXML
    private Button botaoPesquisarVacina;

    @FXML
    private Button botaoVacinaEditar;

    @FXML
    private Button botaoVacinaNova;

    @FXML
    private Button botaoVacinaRemover;

    @FXML
    private TableColumn<?, ?> colunaCodigoPessoa;

    @FXML
    private TableColumn<?, ?> colunaCodigoVacina;

    @FXML
    private TableColumn<?, ?> colunaCpfPessoa;

    @FXML
    private TableColumn<?, ?> colunaDescricaoVacina;

    @FXML
    private TableColumn<?, ?> colunaNascimentoPessoa;

    @FXML
    private TableColumn<?, ?> colunaNomePessoa;

    @FXML
    private TableColumn<?, ?> colunaNomeVacina;

    @FXML
    private DatePicker dataFinal;

    @FXML
    private DatePicker dataInicial;

    @FXML
    private TextField pessoaCodigo;

    @FXML
    private TextField pessoaCpf;

    @FXML
    private TextField pessoaNome;

    @FXML
    private TableView<?> tabelaPessoa;

    @FXML
    private TableView<?> tabelaVacina;

    @FXML
    private TextField vacinaCodigo;

    @FXML
    private TextArea vacinaDescricao;

    @FXML
    private TextField vacinaNome;

    @FXML
    void criarAplicacaoClicado(ActionEvent event) {

    }

    @FXML
    void pesquisarPessoaClicado(ActionEvent event) {

    }

    @FXML
    void pesquisarVacinaClicado(ActionEvent event) {

    }

    @FXML
    void vacinaEditarClicado(ActionEvent event) {

    }

    @FXML
    void vacinaNovaClicado(ActionEvent event) {

    }

    @FXML
    void vacinaRemoverClicado(ActionEvent event) {

    }

}
