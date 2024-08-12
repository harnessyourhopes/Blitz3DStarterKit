Function CreateSkybox()
	; load texture
	sky_texture = LoadTexture("assets/skybox/1.bmp")
	; skybox sphere
	sky_sphere = CreateSphere(50)
	EntityOrder(sky_sphere, 1)	
	
	; flip normals of sphere so inner faces cull instead
	; of outer faces
	FlipMesh sky_sphere
	
	ScaleEntity sky_sphere, 50, 50, 50
	EntityTexture sky_sphere, sky_texture
	
	Return sky_sphere
End Function

Function UpdateSkybox(skybox, posX, posY, posZ)
	PositionEntity skybox, posX, posY, posZ
End Function
