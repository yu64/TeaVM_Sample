package test;


import org.teavm.jso.browser.Window;
import org.teavm.jso.canvas.CanvasRenderingContext2D;
import org.teavm.jso.dom.html.HTMLBodyElement;
import org.teavm.jso.dom.html.HTMLCanvasElement;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class App {

	private HTMLDocument document;
	private HTMLCanvasElement  canvas;
	private HTMLElement text;


	public App()
	{
		this.document = Window.current().getDocument();

		this.text = this.document.createElement("h1");
		this.text.withText("Hello World");

		this.canvas = (HTMLCanvasElement) this.document.createElement("canvas");
		this.canvas.setAttribute("width", "500");
		this.canvas.setAttribute("height", "500");

		HTMLBodyElement body = this.document.getBody();
		body.insertBefore(this.canvas, null);
		body.insertBefore(this.text, null);

		this.render();
	}

	public void render()
	{
		CanvasRenderingContext2D g2 = (CanvasRenderingContext2D) this.canvas.getContext("2d");

		g2.setFillStyle("#FFA500");
		g2.setStrokeStyle("grey");
		g2.fillRect(0, 0, 500, 500);

		//描画を確定させる。
		g2.save();

		g2.setFillStyle("red");
		g2.setStrokeStyle("grey");
		g2.fillRect(0, 0, 100, 100);
		g2.save();

	}




}
