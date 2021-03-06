USE [master]
GO
/****** Object:  Database [FoodBlog]    Script Date: 14/07/2022 11:24:17 CH ******/
CREATE DATABASE [FoodBlog]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'FoodBlog', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.DBSM\MSSQL\DATA\FoodBlog.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'FoodBlog_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.DBSM\MSSQL\DATA\FoodBlog_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [FoodBlog] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FoodBlog].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [FoodBlog] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [FoodBlog] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [FoodBlog] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [FoodBlog] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [FoodBlog] SET ARITHABORT OFF 
GO
ALTER DATABASE [FoodBlog] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [FoodBlog] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [FoodBlog] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [FoodBlog] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [FoodBlog] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [FoodBlog] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [FoodBlog] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [FoodBlog] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [FoodBlog] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [FoodBlog] SET  DISABLE_BROKER 
GO
ALTER DATABASE [FoodBlog] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [FoodBlog] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [FoodBlog] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [FoodBlog] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [FoodBlog] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [FoodBlog] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [FoodBlog] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [FoodBlog] SET RECOVERY FULL 
GO
ALTER DATABASE [FoodBlog] SET  MULTI_USER 
GO
ALTER DATABASE [FoodBlog] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [FoodBlog] SET DB_CHAINING OFF 
GO
ALTER DATABASE [FoodBlog] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [FoodBlog] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [FoodBlog] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [FoodBlog] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'FoodBlog', N'ON'
GO
ALTER DATABASE [FoodBlog] SET QUERY_STORE = OFF
GO
USE [FoodBlog]
GO
/****** Object:  Table [dbo].[Blog]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Blog](
	[BlogID] [int] IDENTITY(1,1) NOT NULL,
	[BlogTitle] [nvarchar](100) NOT NULL,
	[Image] [nvarchar](1000) NULL,
	[Content] [nvarchar](max) NOT NULL,
	[Category] [nvarchar](100) NOT NULL,
	[CreatedDate] [date] NOT NULL,
	[CategoryID] [int] NULL,
	[Author] [nvarchar](50) NULL,
 CONSTRAINT [PK_Blog] PRIMARY KEY CLUSTERED 
(
	[BlogID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[CategoryID] [int] NOT NULL,
	[Category Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Comment]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Comment](
	[CommentID] [int] IDENTITY(1,1) NOT NULL,
	[Content] [nvarchar](1000) NULL,
	[BlogID] [int] NULL,
	[BlogTitile] [nvarchar](100) NULL,
	[Username] [nvarchar](100) NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[CommentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tip]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tip](
	[TipID] [int] IDENTITY(1,1) NOT NULL,
	[TipName] [nvarchar](255) NOT NULL,
	[TipImage] [nvarchar](255) NULL,
	[TipContent] [nvarchar](max) NOT NULL,
	[Category] [nvarchar](50) NULL,
	[CategoryID] [int] NULL,
	[DateCreated] [date] NULL,
	[Author] [nvarchar](50) NULL,
 CONSTRAINT [PK_Tip] PRIMARY KEY CLUSTERED 
(
	[TipID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[UserId] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [nvarchar](100) NOT NULL,
	[UserPassword] [nvarchar](100) NOT NULL,
	[RoleID] [int] NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[UserId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User_Review]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User_Review](
	[ReviewID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Job] [nvarchar](50) NULL,
	[Review] [nvarchar](max) NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_User_Review] PRIMARY KEY CLUSTERED 
(
	[ReviewID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VideoRecommend]    Script Date: 14/07/2022 11:24:18 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VideoRecommend](
	[VideoID] [int] IDENTITY(1,1) NOT NULL,
	[YoutubeLink] [nvarchar](50) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[Status] [int] NOT NULL,
 CONSTRAINT [PK_VideoRecommend] PRIMARY KEY CLUSTERED 
(
	[VideoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Blog] ON 

INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (1, N'Addictive chocolate mousse                                     ', N'Images/1.jpg', N'<div>
                                If you''re a chocolate lover then this is something that you have to know,
                                the chocolate mousse will definitely charm your taste instantly. 
                            </div>
                            <br>
                            <div>
                                Ingredients needed:
                                <ul>
                                    <li>Chocolate(I recommend using the type with at least 65% cacao)</li>
                                    <li>Heavy cream/whipping cream</li>
                                    <li>Eggs(optional)</li>
                                </ul>
                            </div>
                            <div>
                                Now here are the steps: 
                            </div><br>
                            <blockquote>
                                First you need to melt the chocolate then let it cool for a while
                            </blockquote>
                            <img class="featured-image img-fluid" src="Images/meltedChoco.jpg"> <br>
                            <blockquote>
                                <div>While waiting for the chocolate to cool down a bit, let''s start whipping your cream.</div>
                                <div>Use a hand or a stand mixer to beat your cream, or you can use a whisk and some muscles if you want to be Popeyes.
                                    Keep going until it forms a soft peak.
                                </div> <br>
                                <div>(A tip: use cold cream instead of room temp for faster result).</div> <br>
                                <div>Also be careful not to over or under whip the cream, otherwise your mousse will turn
                                    into shit.
                                </div>
                            </blockquote>
                            <img class="featured-image img-fluid" src="Images/whippedCream.jpg"> <br>

                            <blockquote>
                                <div>Finally, when your cream is ready, all you need to do is mix it with the melted chocolate</div>
                                <div>And that''s it, that''s your super easy two-ingredient choco mousse. 
                                    Now you just need to put it the fridge for about an hour or two then enjoy
                                </div>
                            </blockquote>  <br>  
                            <div>But wait, that is good but a bit too simple dont you think?
                                Let''s add something more to enhance the taste, shall we?
                            </div> <br>
                            <blockquote>
                                > Take the eggs from earlier and separate the yolk and the white,
                                beat the white egg until it gets thicken and forms a soft peak <br>
                                > Mix the yolk with the chocolate, the white with the cream <br>
                                > And finally, put the 2 mixtures together <br>
                                (You can also add more flavors such as fruits, topped with whipped cream or anything of your preference,
                                make as many layers as you want)
                            </blockquote>
                            <img class="featured-image img-fluid" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqBR63kFcHScqQ_MA-mKZJF63SfHsGT058mw&usqp=CAU"> <br>
                            <div>
                                Enjoy the creamy, thic and smooth mousse ! 
                            </div><br>', N'Dessert                                                                                             ', CAST(N'2022-12-12' AS Date), 1, N'Halinh')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (2, N'The amazing choco cookies                                                                           ', N'Images/2.jpg', N'Choco cookies are the best', N'Dessert                                                                                             ', CAST(N'2022-02-20' AS Date), 1, N'Linhha')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (3, N'Silky avocado smoothie ', N'Images/avocado.jpg', N'<div>
                                Avocado smoothie is a great drink for a hot summer day. 
                            </div>
                            <br>
                            <div>
                                What you need:
                                <ul>
                                    <li>A few avocados</li>
                                    <li>Sweetened condensed milk</li>
                                    <li>Plain milk</li>
                                </ul>
                            </div>
                            <div>
                                Now here are the steps: 
                            </div><br>
                            <blockquote>
                                abc ...abc
                            </blockquote>
                            <img class="featured-image img-fluid" src="Images/avocado.jpg"> <br>
                            <div>
                                Enjoy the smoothy smoothie ! 
                            </div><br>', N'Drinks', CAST(N'2022-12-12' AS Date), 2, N'Ha Linh')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (4, N'Tinto de verano para el verano', N'Images/tinto.jpg', N'Tinto de verano', N'Drinks', CAST(N'2022-03-16' AS Date), 2, N'Linh Ha')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (5, N'Trà &#129371;&#273;á &#129482;', N'Images/trada.jpg', N'
Tr&agrave; + &#273;&aacute; = tr&agrave; &#273;&aacute;

', N'Drinks', CAST(N'2022-03-16' AS Date), 2, N'Halinh')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (6, N'Lick some ice cream', N'Images/icecream.jpg', N'
   <pre style="font-family: times new roman;font-size: 20px;">
Ice cream is a perfect dessert. Ingredients: 
	- whipping cream 
	- eggs
Steps:
	- abc
	- edf
	<center>
	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwaEKEcC5Lbzba19ei4nfJhHf2hbrUDe1lGw&usqp=CAU">
	</center>
Enjoy	
	</pre>
   ', N'Dessert', CAST(N'2022-03-13' AS Date), 1, N'Linhha')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (31, N'The first thing you need to know when  you''re a beginner', N'Images/Tip1.jpg', N'If youre are a beginner, there is this piece of advice that I rarely see people mention,
                                so let me tell you what it is: <br> <br>
                                <b style="font-family: sans-serif">WASH YOUR HANDS BEFORE TOUCHING THE FOOD, DONT BE A FILTHY PIG.</b>
                                <br> <br>
                                Seriously, no one wants to taste the skin on your ass, and those bacteria on your fingers wont add any nutrition to the dish. 
                                <br>So, wash your hands with soap &#128151;', N'Tip', CAST(N'2022-02-13' AS Date), 3, N'Linhha')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (41, N'Things that will hopefully make your cooking easier', N'Images/Tip1.jpg', N'Tip 123
', N'Tip', CAST(N'2022-03-13' AS Date), 3, N'Halinh')
INSERT [dbo].[Blog] ([BlogID], [BlogTitle], [Image], [Content], [Category], [CreatedDate], [CategoryID], [Author]) VALUES (47, N'You will bake a fluffier cake with these steps', N'Images/Tip1.jpg', N'
abaebbra

', N'Tip', CAST(N'2022-03-24' AS Date), 3, N'tip')
SET IDENTITY_INSERT [dbo].[Blog] OFF
GO
INSERT [dbo].[Category] ([CategoryID], [Category Name]) VALUES (1, N'Dessert')
INSERT [dbo].[Category] ([CategoryID], [Category Name]) VALUES (2, N'Drinks')
INSERT [dbo].[Category] ([CategoryID], [Category Name]) VALUES (3, N'Tips')
GO
SET IDENTITY_INSERT [dbo].[Comment] ON 

INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (1, N'Amazing. Cannot believe how easy and tasty it is to make this. ', 1, N'ChocoMousse', N'User1')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (4, N'Ngon', 5, NULL, N'tradarules')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (6, N'i love avocado', 3, N'', N'avo')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (8, N'tasty', 6, N'', N'ilovecream')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (9, N'Delicious', 1, N'', N'susu')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (10, N'sipping wine on the beach is the best thing ever', 4, N'', N'halinh')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (21, N'choco comment', 1, N'', N'test')
INSERT [dbo].[Comment] ([CommentID], [Content], [BlogID], [BlogTitile], [Username]) VALUES (22, N'choco 2
', 1, N'', N'test2')
SET IDENTITY_INSERT [dbo].[Comment] OFF
GO
SET IDENTITY_INSERT [dbo].[Tip] ON 

INSERT [dbo].[Tip] ([TipID], [TipName], [TipImage], [TipContent], [Category], [CategoryID], [DateCreated], [Author]) VALUES (1, N'The first thing you need to know when first got into cooking', N'Images/Tip1.jpg', N'If youre are a beginner, there is this piece of advice that I rarely see people mention,
                                so let me tell you what it is: <br> <br>
                                <b style="font-family: sans-serif">WASH YOUR HANDS BEFORE TOUCHING THE FOOD, DON''T BE A FILTHY PIG.</b>
                                <br> <br>
                                Seriously, no one wants to taste the skin on your ass and those bacteria on your fingers won''t add any nutrition to the dish either. 
                                <br>So, wash your hands with soap &#128151;', N'Tip', 3, CAST(N'2022-02-13' AS Date), N'Linhha')
INSERT [dbo].[Tip] ([TipID], [TipName], [TipImage], [TipContent], [Category], [CategoryID], [DateCreated], [Author]) VALUES (2, N'Things will hopefully make your cooking easier', N'Images/Tip1.jpg', N'Tip 2', N'Tip', 3, CAST(N'2022-02-13' AS Date), N'Linhha')
INSERT [dbo].[Tip] ([TipID], [TipName], [TipImage], [TipContent], [Category], [CategoryID], [DateCreated], [Author]) VALUES (3, N'What you should do to improve your cooking skills', N'Images/Tip1.jpg', N'tip number 3', N'Tip', 3, CAST(N'2022-02-13' AS Date), N'Halinh')
INSERT [dbo].[Tip] ([TipID], [TipName], [TipImage], [TipContent], [Category], [CategoryID], [DateCreated], [Author]) VALUES (4, N'new tip', N'', N'tip content', N'Tip', 3, CAST(N'2022-02-02' AS Date), N'Author tip')
SET IDENTITY_INSERT [dbo].[Tip] OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([UserId], [UserName], [UserPassword], [RoleID]) VALUES (1, N'Admin', N'Password', 1)
SET IDENTITY_INSERT [dbo].[User] OFF
GO
SET IDENTITY_INSERT [dbo].[User_Review] ON 

INSERT [dbo].[User_Review] ([ReviewID], [Name], [Job], [Review], [Status]) VALUES (1, N'Taylor Swift', N'The music Industry', N'Charmed my whole family with these recipes. Love you to the moon and to saturn, Linh', 1)
INSERT [dbo].[User_Review] ([ReviewID], [Name], [Job], [Review], [Status]) VALUES (11, N'Susu', N'Polyglot', N'Fantastico', 1)
INSERT [dbo].[User_Review] ([ReviewID], [Name], [Job], [Review], [Status]) VALUES (13, N'Kim Anh', N'Dân chơi', N'Tuyệt vời, 10 điểm', 1)
INSERT [dbo].[User_Review] ([ReviewID], [Name], [Job], [Review], [Status]) VALUES (20, N'name', N'', N'review', 0)
SET IDENTITY_INSERT [dbo].[User_Review] OFF
GO
SET IDENTITY_INSERT [dbo].[VideoRecommend] ON 

INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (1, N'https://www.youtube.com/watch?v=wMpqCRF7TKg', N'Champage problems', 1)
INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (2, N'https://www.youtube.com/watch?v=pEY-GPsru_E', N'Seven', 1)
INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (3, N'https://www.youtube.com/watch?v=fkHoIrI-2lg', N'Brownies in 3 ways by Josh Weisman', 1)
INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (4, N'https://www.youtube.com/watch?v=4XMtlZqbtAE', N'Honey soy chicken by Tin eats', 0)
INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (5, N'https://www.youtube.com/watch?v=Qn64T2W2gMc', N'Fish in wine by Tin eats', 1)
INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (7, N'https://www.youtube.com/watch?v=AgFeZr5ptV8', N'22 - TS', 1)
INSERT [dbo].[VideoRecommend] ([VideoID], [YoutubeLink], [Description], [Status]) VALUES (8, N'https://www.youtube.com/watch?v=9nIOx-ezlzA', N'Ivy - TS', 1)
SET IDENTITY_INSERT [dbo].[VideoRecommend] OFF
GO
ALTER TABLE [dbo].[User_Review] ADD  CONSTRAINT [DF_User_Review_Status]  DEFAULT ((0)) FOR [Status]
GO
ALTER TABLE [dbo].[VideoRecommend] ADD  CONSTRAINT [DF_VideoRecommend_Status]  DEFAULT ((0)) FOR [Status]
GO
ALTER TABLE [dbo].[Category]  WITH CHECK ADD  CONSTRAINT [FK_Category_Category] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Category] ([CategoryID])
GO
ALTER TABLE [dbo].[Category] CHECK CONSTRAINT [FK_Category_Category]
GO
USE [master]
GO
ALTER DATABASE [FoodBlog] SET  READ_WRITE 
GO
