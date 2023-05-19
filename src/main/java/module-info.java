module vanessa.sistemaintegradogestao {
    requires javafx.controls;
    requires javafx.fxml;


    opens vanessa.sistemaintegradogestao to javafx.fxml;
    exports vanessa.sistemaintegradogestao;
}