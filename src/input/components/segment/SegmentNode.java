package input.components.segment;

import input.components.point.PointNode;

/**
 * A utility class only for representing ONE segment
 */
public class SegmentNode
{
	protected PointNode _point1;
	protected PointNode _point2;
	
	public PointNode getPoint1() { return _point1; }
	public PointNode getPoint2() { return _point2; }
	
	public SegmentNode(PointNode pt1, PointNode pt2){
		
		_point1 = pt1;
		_point2 = pt2;
		
		//hello
	}

	public boolean equals(SegmentNode that){
		
		return (_point1.equals(that._point1) && _point2.equals(that._point2));
		
	}
}