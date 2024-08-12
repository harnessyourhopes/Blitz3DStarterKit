Type MainCamera
	Field Camera
	; position
	Field X
	Field Y
	Field Z
	
	; rotation
	Field Pitch
	Field Yaw
	Field Roll
End Type

Function InitMainCamera()
	Return CreateCamera()
End Function

Function UpdateMainCamera(camera.MainCamera) 
	Local X = camera\X
	Local Y = camera\Y
	Local Z = camera\Z
	
	; Camera Position
	
	If KeyDown(17) Then 
		MoveEntity camera\Camera, 0, 0, 0.002
	EndIf
	
	If KeyDown(31) Then 
		MoveEntity camera\Camera, 0, 0, -0.002
	EndIf
	
	If KeyDown(30) Then 
		MoveEntity camera\Camera, -0.002, 0, 0
	EndIf
	
	If KeyDown(32) Then 
		MoveEntity camera\Camera, 0.002, 0, 0
	EndIf
	
	; Camera Rotation
	
	If KeyDown(200) Then 
		TurnEntity camera\Camera, -0.2, 0, 0
	EndIf
	
	If KeyDown(208) Then 
		TurnEntity camera\Camera, 0.2, 0, 0
	EndIf
	
	camera\X = EntityX(camera\Camera, True)
	camera\Y = EntityY(camera\Camera, True)
	camera\Z = EntityZ(camera\Camera, True)
End Function


