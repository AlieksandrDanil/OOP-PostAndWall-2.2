import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val serviceEnter0 = WallService()
        serviceEnter0.add(Post(0,
            25,
            59,
            12,
            1647797692,
            "New Netology Post",
            37,
            84,
            true,
            Post.Comments(2, true, 4, canClose = false, canOpen = false),
            Post.Copyright(83, "https://--", "Some Name", "Some Type"),
            Post.Likes(95, userLikes = false, canLike = true, canPublish = false),
            Post.Reposts(47, true),
            Post.Views(2),
            Post.PostType.post,
            Post.PostSource(Post.PostSource.Type.Vk,"",""," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(42,53,44,3), Post.Attachment.Audio(555,33,44,4)),
            Post.Geo("","",Post.Geo.Place(1,"",253511,101537,1647797883,"",5,1647797883,2,159,25,"")),
            25,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            //copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42))

        val serviceCheck0 = Post(1,
            25,
            59,
            12,
            1647797692,
            "New Netology Post",
            37,
            84,
            true,
            Post.Comments(2, true, 4, canClose = false, canOpen = false),
            Post.Copyright(83, "https://--", "Some Name", "Some Type"),
            Post.Likes(95, userLikes = false, canLike = true, canPublish = false),
            Post.Reposts(47, true),
            Post.Views(2),
            Post.PostType.post,
            Post.PostSource(Post.PostSource.Type.Vk,"",""," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(3, 25,106,9), Post.Attachment.Audio(55,3,4,47)),
            Post.Geo("","",Post.Geo.Place(1,"",253511,101537,1647797883,"",5,1647797883,2,159,25,"")),
            25,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42)

        assertEquals(serviceCheck0.id, serviceEnter0.posts[0].id)

        val serviceEnterId8 = serviceEnter0
        serviceEnterId8.add(Post(2,
            31,
            43,
            14,
            1647797883,
            "Second Netology Post",
            38,
            137,
            false,
            Post.Comments(5, false, 4, canClose = false, canOpen = true),
            Post.Copyright(83, "https://--", "Some Name", "Some Type"),
            Post.Likes(95, userLikes = false, canLike = true, canPublish = true),
            Post.Reposts(47, false),
            Post.Views(15),
            Post.PostType.suggest,
            Post.PostSource(Post.PostSource.Type.Rss,null,null," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(96,3,48,37), Post.Attachment.Audio(35,3,81,21)),
            Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            47,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            Post.Donut(true, 102, placeHolder = "Some Second String", true, Post.Donut.EditMode.all),
            70))

        assertEquals(2, serviceEnterId8.posts[1].id)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()

        // заполняем несколькими постами
        service.add(Post(0,
            25,
            59,
            12,
            1647797692,
            "New Netology Post",
            37,
            84,
            true,
            Post.Comments(2, true, 4, canClose = false, canOpen = false),
            Post.Copyright(83, "https://--", "Some Name", "Some Type"),
            Post.Likes(95, userLikes = false, canLike = true, canPublish = false),
            Post.Reposts(47, true),
            Post.Views(2),
            Post.PostType.post,
            Post.PostSource(null,null,null," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(18,23,83,104), Post.Attachment.Audio(555,33,44,4)),
            Post.Geo("MyTypePlace","N:253511,W:101537",null),
            25,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42))

        service.add(Post(2,
            31,
            43,
            14,
            1647797883,
            "Second Netology Post",
            38,
            137,
            false,
            Post.Comments(5, false, 4, canClose = false, canOpen = true),
            Post.Copyright(83, "https://--", "Some Name", "Some Type"),
            Post.Likes(95, userLikes = false, canLike = true, canPublish = true),
            Post.Reposts(47, false),
            Post.Views(15),
            Post.PostType.suggest,
            Post.PostSource(Post.PostSource.Type.Api,"",""," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(48,153,4,39), Post.Attachment.Audio(90,30,4,42)),
            Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            47,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            //copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            Post.Donut(true, 102, placeHolder = "Some Second String", true, Post.Donut.EditMode.all),
            70))

        service.add(Post(id = 3,
            ownerId = 63,
            fromId = 13,
            createdBy = 75,
            date = 19,
            text = "Updated Netology Post",
            replyOwnerId = 135,
            replyPostId = 66,
            friendsOnly = true,
            comments = Post.Comments(9, true, 5, canClose = true, canOpen = true),
            copyright = Post.Copyright(85, "https://site-updated", "Some Updated Name", "Some Updated Type"),
            likes = Post.Likes(96, userLikes = false, canLike = true, canPublish = false),
            reposts = Post.Reposts(8, false),
            views = Post.Views(7),
            postType = Post.PostType.postpone,
            postSource = Post.PostSource(Post.PostSource.Type.Rss,"",""," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(11,70,42,31), Post.Attachment.Audio(5,80,4,40)),
            geo = Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            signerId = 61,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            //copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, 8, "Some Old String", false, Post.Donut.EditMode.all),
            postponedId = 40))

        // создаём информацию об обновлении для true
        val update = Post(id = 3,
            ownerId = 111,
            fromId = 56,
            createdBy = 15,
            date = 13,
            text = "Updated Netology Post",
            replyOwnerId = 103,
            replyPostId = 87,
            friendsOnly = false,
            comments = Post.Comments(9, false, 5, canClose = true, canOpen = false),
            copyright = Post.Copyright(85, "https://site-updated", "Some Updated Name", "Some Updated Type"),
            likes = Post.Likes(96, userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts(48, false),
            views = Post.Views(10),
            postType = Post.PostType.reply,
            postSource = Post.PostSource(Post.PostSource.Type.Sms,"",""," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(110,503,440,3), Post.Attachment.Audio(52,30,8,3)),
            geo = Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            signerId = 61,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = true,
            isFavorite = false,
            donut = Post.Donut(false, 118, "Some Updated String", true, Post.Donut.EditMode.duration),
            postponedId = 38)

        val result = service.update(update)
        assertTrue(result)

        val updateFalse = Post(id = 6,
            ownerId = 111,
            fromId = 56,
            createdBy = 15,
            date = 13,
            text = "Updated Netology Post",
            replyOwnerId = 103,
            replyPostId = 87,
            friendsOnly = false,
            comments = Post.Comments(9, false, 5, canClose = true, canOpen = false),
            copyright = Post.Copyright(85, "https://site-updated", "Some Updated Name", "Some Updated Type"),
            likes = Post.Likes(96, userLikes = true, canLike = true, canPublish = true),
            reposts = Post.Reposts(48, false),
            views = Post.Views(10),
            postType = Post.PostType.reply,
            postSource = Post.PostSource(Post.PostSource.Type.Widget,"",""," https://vk.com/"),
            attachments = arrayOf(Post.Attachment.Video(42,53,44,3), Post.Attachment.Audio(59,3,4,28)),
            geo = Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            signerId = 61,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = true,
            isFavorite = false,
            donut = Post.Donut(false, 118, "Some Updated String", true, Post.Donut.EditMode.duration),
            postponedId = 38)

        val resultFalse = service.update(updateFalse)
        assertFalse(resultFalse)
    }
}