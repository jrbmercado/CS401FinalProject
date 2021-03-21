# BKJ Home Security System
Simulation of a integrated home security system complete with GUI interface and sensor detection.

## Purpose
1. Junior Software Engineering Project.
2. Work in a group of 3 and learn to set project deadlines and expectations.
3. Develop software project design documents such as UML, Gantt Chart, Sequence Diagram, Use Case Diagrams, and Requirement Documents.
4. Worked through roadblocks and setbacks if members were not sticking to deadlines.
5. Established Junit test cases.

## Tools Used
1. Junit
2. Eclipse

## Logic
1. Have a central GUI interface that connects directly to emergency services and sensors placed throughout the house.
2. When sensor detects an emergency, system should contact approprate emergency services with house and emergency situation information.
3. Create a crime news feed for peer to peer interaction.
4. Design the project so it can be implimented across many homes and managed in a database.
5. Use object oriented design to split responsibilities into three components:
	- 911-Dispatch
			- Simulated 911 response: provided ETA time and the type of emergency response coming.
	- Home-Alarm System
	    - Determined when an emergency is occuring from sensors.
	    - Sends client information to 911 dispatch when emergency is triggered.
	- Simulated News Feed
	    - Allows users to browse and create new crime reports.
