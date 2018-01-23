package com.yuzk.composite;

import java.util.ArrayList;
import java.util.List;



public interface AbstractFile {
	void killVirus();
}
class ImageFile implements AbstractFile{
	private String name;
	public ImageFile(String name){
		this.name = name;
	}
	public void killVirus() {
		System.out.println("图片:"+name+"杀毒");
	}
}
class TextFile implements AbstractFile{
	private String name;
	public TextFile(String name){
		this.name = name;
	}
	public void killVirus() {
		System.out.println("图片:"+name+"杀毒");
	}
}
class VideoFile implements AbstractFile{
	private String name;
	public VideoFile(String name){
		this.name = name;
	}
	public void killVirus() {
		System.out.println("图片:"+name+"杀毒");
	}
}
class FolderFile implements AbstractFile{
	private String name;
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public FolderFile(String name){
		this.name = name;
	}
	public void killVirus() {
		System.out.println("文件夹："+name+"杀毒");
		for(AbstractFile file:list){
			file.killVirus();
		}
	}
	public void add(AbstractFile af){
		list.add(af);
	}
	public void remove(AbstractFile af){
		list.remove(af);
	}
	public AbstractFile getAbstractFile(int index){
		return list.get(index);
	}
	
}