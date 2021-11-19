/* Kreirati apstraktnu klasu Control koja ima:
	●abstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer */

package videoPlayer;
public abstract class Control {
	public abstract void izvrsiAkciju(VideoPlayer vp);
}