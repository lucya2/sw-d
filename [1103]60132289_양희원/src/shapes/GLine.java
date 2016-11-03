package shapes;

import java.awt.Graphics2D;

import constants.GConstants.EDrawingType;

public class GLine extends GShape {
	private int x, y, x1, y1;
	public GLine(){
		super(EDrawingType.TP);
		this.x = 0;
		this.y = 0;
		this.x1 = 0;
		this.y1 = 0;
	}
	@Override
	public void draw(Graphics2D g2D) {
		g2D.drawLine(this.x, this.y, this.x1, this.y1);	
	}

	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		this.x = x;
		this.y = y;
		this.x1 = x;
		this.y1 = y;
	}

	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		g2D.drawLine(this.x, this.y, this.x1, this.y1);
		this.x1 = x;
		this.y1 = y;
		g2D.drawLine(this.x, this.y, this.x1, this.y1);
	}

	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void continueDrawing(int x, int y, Graphics2D g2d) {
	}

}
