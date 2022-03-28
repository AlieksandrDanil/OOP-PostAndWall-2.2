fun main() {     // функция main - только для ручного тестирования
    val original = Post(
        0,
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
        Post.PostType.Post,
        Post.PostSource(Post.PostSource.Type.Vk,null,null," https://vk.com/"),
        attachments = arrayOf(
            Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
            Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
            Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
            Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
            Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
        ),
        Post.Geo("","",Post.Geo.Place(1,"",253511, 101537, 1647797883,"", 5, 1647797883, 2, 159, 25,"")),
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
        42
    )

    val copy = Post(
        0,
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
        Post.PostType.Suggest,
        Post.PostSource(Post.PostSource.Type.Rss,null,null," https://vk.com/"),
        attachments = arrayOf(
            Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Updated Photo Attached File"),
            Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Updated Video Attached File"),
            Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Updated Audio Attached File"),
            Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Updated Document Attached File"),
            Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Updated Contact Attached File")
        ),
        Post.Geo("","",Post.Geo.Place(2,"", 253511, 101580, 1647797905,"", 5, 1647797905, 1, 183, 29,"")),
        47,
        copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
        canPin = false,
        canDelete = false,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        Post.Donut(true, 102, placeHolder = "Some Second String", true, Post.Donut.EditMode.all),
        70
    )

    val copyUpdated = Post(
        id = 2,
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
        postType = Post.PostType.Reply,
        postSource = Post.PostSource(Post.PostSource.Type.Api,null,null," https://vk.com/"),
        attachments = arrayOf(
            Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
            Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
            Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
            Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
            Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
        ),
        //geo = Post.Geo("","",Post.Geo.Place(2,"", 253511, 101580, 1647797905,"", 5, 1647797905, 1, 183, 29,"")),
        geo = Post.Geo("MyTypePlace","N:253511, W:101580",null),
        signerId = 61,
        copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
        canPin = false,
        canDelete = false,
        canEdit = true,
        isPinned = false,
        markedAsAds = true,
        isFavorite = false,
        donut = Post.Donut(false, 118, "Some Updated String", true, Post.Donut.EditMode.duration),
        postponedId = 38
    )

    val temp1 = WallService()
    println(temp1.add(original))
    val temp2 = temp1
    println(temp2.add(copy))
    val temp3 = temp2
    println(temp3.update(copyUpdated))
    val temp4: Post = temp3.posts[1]
    println(temp4)
}