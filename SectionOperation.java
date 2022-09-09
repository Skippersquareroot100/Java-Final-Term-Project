package interfaces;

import classes.Section;

public interface SectionOperation
{

	boolean addSection(Section s);
	boolean removeSection(Section s);
	Section  searchSection(String Sname);
	void showAllsections();
}