//import strategy.exercise.AES;
//import strategy.exercise.ChatClient;
//import strategy.exercise.DES;
//import iterator.exercise.Product;
//import iterator.exercise.ProductCollection;
//import iterator.BrowseHistory;
//import iterator.Iterator;
//import state.Exercises.*;
//import State.BrushTool;
//import State.Canvas;
//import State.EraserTool;
//import State.SelectionTool;
//import memento.Editor;
//import memento.History;
//import template.GenerateReportTask;
//import template.TransferMoneyTask;
//import template.exercise.Example;
//import command.AddCustomerCommand;
//import command.CustomerService;
//import command.fx.Button;
//import command.videoEditor.*;
//import observer.Chart;
//import observer.DataSource;
//import observer.SpreadSheet;
//import observer.stockApp.Observer;
//import observer.stockApp.StatusBar;
//import observer.stockApp.Stock;
//import observer.stockApp.StockListView;
//import chainOfResponsibility.exercise.DataReaderFactory;
//import visitor.*;

import visitor.wavFile.AddReverbOperator;
import visitor.wavFile.NormalizeOperator;
import visitor.wavFile.ReduceNoiseOperator;
import visitor.wavFile.WavFile;

public class Main {
    public static void main(String[] args) {
        /* MEMENTO patten */
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("a");
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        history.push(editor.createState());
//        editor.setContent("d");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());
//-----------------------------------------------------------------------------------------------------------------------
        /* STATE patten */
//        var canvas = new Canvas();
//        canvas.setCurrentTool(new SelectionTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        System.out.println();
//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        System.out.println();
//        canvas.setCurrentTool(new EraserTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        // STATE Pattern Exercise
//        var directionService = new DirectionService();
//
//        directionService.setTravelMode(new Driving());
//        directionService.getEta();
//        directionService.getDirection();
//
//        directionService.setTravelMode(new Bicycling());
//        directionService.getEta();
//        directionService.getDirection();
//
//        directionService.setTravelMode(new Transit());
//        directionService.getEta();
//        directionService.getDirection();
//
//        directionService.setTravelMode(new Walking());
//        directionService.getEta();
//        directionService.getDirection();
//-----------------------------------------------------------------------------------------------------------------------
        /* ITERATOR patten */
//        var history = new BrowseHistory();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//        history.push("d");
//        System.out.println(history.pop());
//
//
//        Iterator<String> iterator = history.createIterator();
//        while (iterator.hasNext()) {
//            var url = iterator.current();
//            System.out.println(url);
//            iterator.next();
//        }
        /* Iterator Pattern Exercise */
//        var collection = new ProductCollection();
//        collection.add(new Product(1, "a"));
//        collection.add(new Product(2, "b"));
//        collection.add(new Product(3, "c"));
//
//        var iterator = collection.createIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.current());
//            iterator.next();
//        }
//-----------------------------------------------------------------------------------------------------------------------
        /* Strategy pattern */
//        var imageStorage = new ImageStorage();
//        imageStorage.store("a",
//                new JpegCompressor(),
//                new BlackAndWhite());
//        imageStorage.store("a",
//                new PngCompressor(),
//                new HighContrast());
        /* Strategy pattern Exercise */
//        var chatClientDES = new ChatClient(new DES());
//        chatClientDES.send("Hello World");
//        var chatClientAES = new ChatClient(new AES());
//        chatClientAES.send("سلام دنیا");
//-----------------------------------------------------------------------------------------------------------------------
        /* Template pattern */
//        var moneyTask = new TransferMoneyTask();
//        moneyTask.execute();
//        var reportTask = new GenerateReportTask();
//        reportTask.execute();
        /* Template pattern Exercise */
//        var example = new Example();
//        example.close();
// -----------------------------------------------------------------------------------------------------------------------
        /* Command pattern  */
//        var service = new CustomerService();
//        var command = new AddCustomerCommand(service);
//        var button = new Button(command);
//        button.click();
        /* Command pattern Undoable Commands */
//        var history = new History();
//        var document = new HtmlDocument();
//        document.setContent("Hello World");
//        // BOLD
//        var htmlBoldCommand = new BoldCommand(document, history);
//        htmlBoldCommand.execute();
//        System.out.println(document.getContent());
//        // UNDO
//        var undoCommand = new UndoCommand(history);
//        undoCommand.execute();
//        System.out.println(document.getContent());
        /* Command pattern Video Editor Exercise*/
//        var videoEditor = new VideoEditor();
//        var history = new History();
//
//        var setTextCommand = new SetTextCommand("Video Title", videoEditor, history);
//        setTextCommand.execute();
//        System.out.println("TEXT: " + videoEditor);
//
//        var setContrast = new SetContrastCommand(1, videoEditor, history);
//        setContrast.execute();
//        System.out.println("CONTRAST: " + videoEditor);
//
//        var undoCommand = new UndoCommand(history);
//        undoCommand.execute();
//        System.out.println("UNDO: " + videoEditor);
//
//        undoCommand.execute();
//        System.out.println("UNDO: " + videoEditor);
//
//        undoCommand.execute();
//        System.out.println("UNDO: " + videoEditor);
//-----------------------------------------------------------------------------------------------------------------------
        /* Observer pattern */
//        var dataSource = new DataSource();
//        var chart = new Chart(dataSource);
//        var spreadSheet = new SpreadSheet(dataSource);
//        dataSource.addObserver(chart);
//        dataSource.addObserver(spreadSheet);
//        dataSource.setValue(5);
//
//        dataSource.removeObserver(chart);
//        dataSource.setValue(6);
        /* Observer pattern StockApp update */
//        var statusBar = new StatusBar();
//        var stockListView = new StockListView();
//
//        var stock1 = new Stock("stock1", 10);
//        var stock2 = new Stock("stock2", 20);
//        var stock3 = new Stock("stock3", 30);
//
//        statusBar.addStock(stock1);
//        statusBar.addStock(stock2);
//
//        stockListView.addStock(stock1);
//        stockListView.addStock(stock2);
//        stockListView.addStock(stock3);
//
//        stock2.setPrice(21);
//
//        stock3.setPrice(9);
//-----------------------------------------------------------------------------------------------------------------------
        /* mediator pattern */
//        var dialog = new ArticlesDialogBox();
//        dialog.simulateUserInteraction();
//-----------------------------------------------------------------------------------------------------------------------
        /*chain of responsibility */
//        Encryptor encryptor = new Encryptor(null);
//        Compressor compressor = new Compressor(encryptor);
////        Logger logger = new Logger(compressor);
//        Authenticator authenticator = new Authenticator(logger);
//        var server = new WebServer((authenticator));
//        server.handle(new HttpRequest("Admin","1234"));
        /* chain of responsibility spreadSheet reader */
//        var dataReader = new DataReaderFactory().run();
//        dataReader.read("ali.xls");
//        dataReader.read("ali.numbers");
//        dataReader.read("ali.qbw");
//        dataReader.read("ali.x");
        /*  visitor pattern */
//        var document = new HtmlDocument();
//        document.add(new HeadingNode());
//        document.add(new AncherNode());
//        document.execute(new HighlightOperator());
//        document.execute(new PlainTextOperator());
        /*  visitor pattern Wav Program */
        var wavFile = WavFile.read("poetWithGun.wav");
        wavFile.applyFilter(new ReduceNoiseOperator());
        wavFile.applyFilter(new AddReverbOperator());
        wavFile.applyFilter(new NormalizeOperator());



    }
}
