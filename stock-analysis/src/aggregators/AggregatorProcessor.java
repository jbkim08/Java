package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {
//	MinAggregator agg = new MinAggregator();
//	AggregatorProcessor<MinAggregator> aggsProcessor = new AggregatorProcessor<MinAggregator>(agg, "table.csv");
//	double value = aggsProcessor.runAggregator(1);
	private T agg;
	private String filePath;
	
	public AggregatorProcessor(T agg, String filePath) {		
		this.agg = agg;
		this.filePath = filePath;
		
	}
	
	public double runAggregator(int colIdx) throws IOException {
		StockFileReader fileReader = new StockFileReader(filePath);
		List<String> lines = fileReader.readFileData();	
		colIdx--;
		for(String line : lines) {
			String[] numbers = line.split(",");
			double value = Double.parseDouble(numbers[colIdx]);
			agg.add(value);
		}	
		double number = agg.calculate();
		return number;
	}
	
}
