package com.yuzk.composite;

public class TTT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFile f1,f2,f3,f4;
		f1 = new ImageFile("wo.jpg");
		f2 = new TextFile("ni.txt");
		f3 = new VideoFile("ta.mp4");
		f4 = new ImageFile("women.jpg");
		FolderFile ff1 = new FolderFile("tamade");
		FolderFile ff2 = new FolderFile("nimade");
		
		ff2.add(f3);
		ff2.add(f4);
		ff2.add(f2);
		ff1.add(f1);
		ff1.add(f2);
		ff1.add(ff2);
		ff1.killVirus();
	}

}
