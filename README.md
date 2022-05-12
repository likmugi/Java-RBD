### Введение в программирование на Java. ООП.
В ходе работы необходимо было изучить принципы создания консольных и оконных приложений, ознакомится с языком программирования Java, его базовыми конструкциями и научится создавать классы и объекты.

Использовалась среда NetBeans.
При реализации работа была разделена на два основных проекта «Lab1_Shamugiya» «Lab1_Shamugiya_ch.2» и дополнительный «Lab1_ShamugiyaLG_ch.2_forms».

Проекты, в свою очередь, имеют реализацию как примеров из методического материала, так и задания по вариантам в соответвующих пакетах. Поэтому в каждом проекте необходимо проверять, какой главный класс использует среда:
``File>Project Properties>Run>Main Class.

#### Проект 1 - создание консольного приложения
В проекте «Lab1_Shamugiya» создается консольное приложение. Классы Arithmetic и ComplexExpression располагаются в пакете «lab1_shamugiya».
В классе Arithmetic прописывались команды вычисления арифметического выражения.
<p align="center"><img src="https://sun9-10.userapi.com/s/v1/if2/jPaQxpFOdP1bps-MrbfNSxRLyJxJoA1S6mWPVrMRkCWiAkYVA1h4qG0mOzHu9y-90Ak4QdK0kTvoJn3qRzvshctF.jpg?size=286x74&quality=96&type=album"/> </p>

В классе ComplexExpression прописывались команды для вычисления сложного выражения, для реализации которого необходимо было использования условной конструкции if-else.
<p align="center"><img src="https://sun9-12.userapi.com/s/v1/if2/oYfJ4OrEAMbBZch0wkNTYrMvVGU9KGN7khlDirBHq0Hd5_SGs35UNQnWrR6BsfheMQ23ktk1FDC6QhhMp8OXVgXT.jpg?size=308x84&quality=96&type=album"/> </p>
#### Проект 1 - создание оконного приложения
В пакетах «formP» и «formP2» находятся классы оконного приложения.

В форме NewJFrame реализовывалось вычисление арифметического выражения. А в форме SecondJForm реализовывалось вычисление сложного выражения, соответственно.

<p align="center">
	<img src="https://sun9-35.userapi.com/s/v1/if2/sYRlOv3CuZlqWQg1XVmMpfPYBR_hxSBdhey9aJVjYYWyah7DQO7SOFSpkD9GMi41w-jkhQbPeArhguRVm42H6Tev.jpg?size=194x170&quality=96&type=album"/>
	<img src="https://sun9-51.userapi.com/s/v1/if2/ONrVe3tpafK1gSG7LfLf9iphxiwlqqSpAY7GIMyITCafySAkBPywrjBNkK3PyzDSC9OlY_JIvbhRoKH6OXPVJy2p.jpg?size=192x165&quality=96&type=album"/>
</p>

#### Проект 2 - создание консольного приложения с объектами

В проекте «Lab1_Shamugiya_ch.2» создается приложение с классами и объектами.
Проект содержит два класса в пакете com.example.domain – «Employee» и «Book». Классы содержат поля, представленные на ниже:
<p align="center"><img src="https://sun9-57.userapi.com/s/v1/if2/3G1GA_wgVrpLVoQ_3SO7Ls4NqGsUEfpqvtUwF9kZ7uIDWe2g5k7HOkxl534MUxytF89u3zDD66HF-EqwQ_n1V3Ek.jpg?size=392x160&quality=96&type=album"/> </p>

Для каждого поля в классе были прописаны геттеры и сеттеры, а также конструктор.

В тестовых классах пакета com.example прописаны команды создания  соответствующих объектов и отображения данных объектов классов.
Результат их работы:
<p align="center">
	<img src="https://sun1-23.userapi.com/s/v1/if2/iR7QYfMz-mLJVGh3rCdjrTT82bDokLmru_rpZJflixWDFN8Bjxfwah_bzuEMa1MgyV5GcKQ6I2g2Um0H78GkSYrb.jpg?size=623x82&quality=96&type=album"/>
</p>
#### проект 2 - доп. создание оконного приложения
Была предпринята попытка продолжить работать с оконными приложениями. В результате была объединена работа с классами Employee и Book и представлена в одной форме «JFrameTest».

<p align="center">
	<img src="https://sun9-42.userapi.com/s/v1/if2/tm43JdX-MyzFbWtVLt1PH3B0b7x3BnzJX2DdM-aVaORc63WFBwdHzplioP-2YFpLAU6Ix91EPE6dLvf9EaV8-OqN.jpg?size=589x160&quality=96&type=album"/>
</p>
### ООП. Наследование классов. Абстрактные методы и интерфейсы.
В ходе работы необходимо было изучить принципы создания приложения с наследованием классов в Java и научится создавать абстрактные классы и интерфейсы.

При реализации работа была разделена на три проекта «Lab1_Shamugiya_ch.1», «Lab1_Shamugiya_ch.1_Book», «Lab1_Shamugiya_ch.2».
Проекты, в свою очередь, имеют содержат по два пакета: «com.example» для тестового класса и  «com.example.domain», который содержит в себе наши собственные классы, с объектами которых мы работаем в тестовом классе.
#### Проект по теме "наследование и полиморфизм"
В проекте «Lab2_Shamugiya_ch.1» создается консольное приложение в соответствии со следующей иерархией классов:
<p align="center">
	<img src="https://sun9-35.userapi.com/s/v1/if2/H6Fr7zYwW6W_LhOnqfqO1DTYN2HIOL_VnZyxUdmFFQPmWPIiwrN65SBTOttpV3NRfeBGfobFphbn5x79Jsif2f2K.jpg?size=425x359&quality=96&type=album"/>
</p>
Программно иерархия классов выглядит так:
<p align="center">
	<img src="https://sun9-81.userapi.com/s/v1/if2/3Q59kynpSwjS6K0t6OClzhMGufXoxkq6W64LILcflHh1biYweDx7HFa7S-sFbPnIpYCQGgjyDRQ7Wpe9y83Kfg_L.jpg?size=264x218&quality=96&type=album"/>
</p>
Результат выполнения программы:
<p align="center">
	<img src="https://sun9-87.userapi.com/s/v1/if2/gXY6RFIoFkM1EqI7Qsdyohjnlh3plNPobwwTAmCRNp_w-woURpPIS9yZ0MojPPJGw-o_rP5bId2PHp37Ky1GmvU8.jpg?size=241x303&quality=96&type=album"/>
</p>
В проекте «Lab2_Shamugiya_ch.1_Book» создается консольное приложение по варианту 10 в соответствии со следующей иерархией классов:
<p align="center">
	<img src="https://sun9-15.userapi.com/s/v1/if2/ss8AQhSmCbWPDX9mjsQBBim6h00z4uCPuAd00H-U00uTjg7tdr2AxUFI7d_b6WYqCYzYw6aaG7MNZ-_qXBVzdYWN.jpg?size=424x379&quality=96&type=album"/>
</p>
Программно иерархия классов выглядит так:
<p align="center">
	<img src="https://sun9-37.userapi.com/s/v1/if2/2eF9lvpDwSfyGtw_18ewO3LGErKvQn_4eawBZWJBXDm_sqKBlO2064SHk51AUA6QxeEl9Z62rL5sb_xBWniifbNa.jpg?size=257x192&quality=96&type=album"/>
</p>
Результат выполнения программы:
<p align="center">
	<img src="https://sun9-40.userapi.com/s/v1/if2/XfqfxdAyzkO9BNxtBebDrlb0G7NlYVtbW18rgdan4FRRggsQvKGT3TeEetQ51Xc3Lx4aD01NvJe20Lxd5k9GQLge.jpg?size=248x247&quality=96&type=album"/>
</p>

#### Проект по теме "Абстракстные классы и интерфейсы"
В проекте «Lab2_Shamugiya_ch.2» создается консольное приложение в соответствии со следующей иерархией классов:
<p align="center">
	<img src="https://sun1-27.userapi.com/s/v1/if2/MsirOv5nkLFi72T7o72iRb28hdeOUk7YuWgZ7w2hzaNDY1QwsxX8PDdU-RRSAFOx0ORVr17l-12mFILRneiHraQ7.jpg?size=531x366&quality=96&type=album"/>
</p>
Программно иерархия классов выглядит так:
<p align="center">
	<img src="https://sun9-13.userapi.com/s/v1/if2/_UpRaHVPDnLgDH4Yr8-E2F5E7Zs6D6GClxlRXApvZIRZYFRfINUMCByWa7WSY3DUT_I7KQFxd-hZIL3qcAH8o4FY.jpg?size=256x209&quality=96&type=album"/>
</p>
Результат выполнения программы:
<p align="center">
	<img src="https://sun9-10.userapi.com/s/v1/if2/DBXDoFHKjw-P69pXH3EiuoknqqwFJ4QZ0AVu7Ixzsddbq8TKVprIQAK9-qPaaDgJlyDe7DjahMmTRYeSyB_DO1O3.jpg?size=299x299&quality=96&type=album"/>
</p>