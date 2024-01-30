# Enterprise_Ex4
ให้เขียน Stateless Session Bean สําหรับแปลงอุณหภูมิจากฟาเรนไฮต์เป็นเซลเซียส โดยใน session bean
ดังกล่าวจะต้องมี remote method คือ fToC() ซึ่งรับพารามิเตอร์ 1 ตัวเป็น อุณหภูมิที่อยู่ในหน่วยองศาฟาเรนต์ไฮต์ 
และส่งค่ากลับเป็นองศาเซลเซียส สูตรการแปลงฟาเรนไฮต์เป็นเซลเซียสคือ
#C = (5/9) * (F -32)
จากนั้นให้เขียน Application ที่เรียกใช้ session bean นี้ด้วย
ตัวอย่าง Input/Output ของ Desktop Application
#Enter degree in Fahrenheit: 32
#32 Fahrenheit = 0.0 Celsius
