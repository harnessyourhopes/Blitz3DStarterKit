Include "vfx/vfx.bb"
Include "utility/console.bb"
Include "camera.bb"

Graphics3D 1280, 720, 32, 2
SetBuffer BackBuffer()

;ConsolePrint("test")

skybox = CreateSkybox()

mainCam.MAINCAMERA = New MAINCAMERA
mainCam\Camera = InitMainCamera()

topLight = CreatePointLight(0, 3, 5, 255, 255, 255, 1)

AmbientLight(50, 50, 50)

sphere = CreateSphere()
plane = CreatePlane()
EntityAlpha plane, 0.3
;mirror = CreateMirror()
;PositionEntity mirror, 0, -1, 0

ScaleEntity plane, 0.1, 1, 0.1
PositionEntity plane, 0, -0.99, 0
PositionEntity sphere,0,0,5

EntityShininess sphere, 0

frameTimer = CreateTimer(60)


While Not KeyDown(1)
	; controls fps
	WaitTimer(frameTimer)
	;PositionEntity topLight, mainCam\X, mainCam\Y, mainCam\Z
	
	If Not (KeyDown(5))
		UpdateMainCamera(mainCam)
		RenderWorld
		Flip 	
	End If 
	
	UpdateSkybox(skybox, mainCam\X, mainCam\Y, mainCam\Z)
	
	Wend
End

Function CreatePointLight(x, y, z, R, G, B, range)
	; Read x,y,z,R,G,B,range
	
	light = CreateLight(2)	
	
	; light properties (color, position, range)
	PositionEntity light, x, y, z
	
	LightRange light, range
	LightColor light, R, G, B
	
	
	Return light
	
End Function 


