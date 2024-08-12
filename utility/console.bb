Function ConsolePrint(consoleText)
	; render console text first
	;SetBuffer FrontBuffer()
	Text 50, 50, "test"
	
	; reset buffer
	SetBuffer BackBuffer()
End Function 