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

import observer.Chart;
import observer.DataSource;
import observer.SpreadSheet;

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
        /* Template pattern */
//        var moneyTask = new TransferMoneyTask();
//        moneyTask.execute();
//        var reportTask = new GenerateReportTask();
//        reportTask.execute();
        /* Template pattern Exercise */
//        var example = new Example();
//        example.close();
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
        /* Observer pattern */
        var dataSource = new DataSource();
        var chart = new Chart(dataSource);
        var spreadSheet = new SpreadSheet(dataSource);
        dataSource.addObserver(chart);
        dataSource.addObserver(spreadSheet);
        dataSource.setValue(5);

        dataSource.removeObserver(chart);
        dataSource.setValue(6);



    }
}
